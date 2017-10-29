package br.com.gpima.converter;

import br.com.gpima.dao.PostoDAO;
import br.com.gpima.domain.Posto;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "postoConverter", forClass = Posto.class)
public class PostoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringPosto) {
        if (stringPosto != null) {
            int id = Integer.parseInt(stringPosto);
            PostoDAO dao = new PostoDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectPosto) {
        if (objectPosto != null) {
            Posto posto = (Posto) objectPosto;
            return String.valueOf(posto.getId());
        }
        return null;
    }
    
}
