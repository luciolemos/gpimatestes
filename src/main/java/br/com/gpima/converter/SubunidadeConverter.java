package br.com.gpima.converter;

import br.com.gpima.dao.SubunidadeDAO;
import br.com.gpima.domain.Subunidade;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "subunidadeConverter", forClass = Subunidade.class)
public class SubunidadeConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringSubunidade) {
        if (stringSubunidade != null) {
            int id = Integer.parseInt(stringSubunidade);
            SubunidadeDAO dao = new SubunidadeDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectSubunidade) {
        if (objectSubunidade != null) {
            Subunidade subunidade = (Subunidade) objectSubunidade;
            return String.valueOf(subunidade.getId());
        }
        return null;
    }
    
}
