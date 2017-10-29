package br.com.gpima.converter;

import br.com.gpima.dao.MilitarDAO;
import br.com.gpima.domain.Militar;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "militarConverter", forClass = Militar.class)
public class MilitarConverter implements Converter {
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringMilitar) {
        if (stringMilitar != null) {
            int id = Integer.parseInt(stringMilitar);
            MilitarDAO dao = new MilitarDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectMilitar) {
        if (objectMilitar != null) {
            Militar militar = (Militar) objectMilitar;
            return String.valueOf(militar.getId());
        }
        return null;
    }
    
}