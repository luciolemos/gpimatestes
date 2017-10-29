package br.com.gpima.converter;

import br.com.gpima.dao.TipoDAO;
import br.com.gpima.domain.Tipo;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "tipoConverter", forClass = Tipo.class)
public class TipoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringTipo) {
        if (stringTipo != null) {
            int id = Integer.parseInt(stringTipo);
            TipoDAO dao = new TipoDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectTipo) {
        if (objectTipo != null) {
            Tipo tipo = (Tipo) objectTipo;
            return String.valueOf(tipo.getId());
        }
        return null;
    }
    
}
