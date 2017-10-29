package br.com.gpima.converter;

import br.com.gpima.dao.ArmaDAO;
import br.com.gpima.domain.Arma;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "armaConverter", forClass = Arma.class)
public class ArmaConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringArma) {
        if (stringArma != null) {
            int id = Integer.parseInt(stringArma);
            ArmaDAO dao = new ArmaDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectArma) {
        if (objectArma != null) {
            Arma arma = (Arma) objectArma;
            return String.valueOf(arma.getId());
        }
        return null;
    }
    
}
