package br.com.gpima.converter;

import br.com.gpima.dao.NaturezaDAO;
import br.com.gpima.domain.Natureza;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "naturezaConverter", forClass = Natureza.class)
public class NaturezaConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringNatureza) {
        if (stringNatureza != null) {
            int id = Integer.parseInt(stringNatureza);
            NaturezaDAO dao = new NaturezaDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectNatureza) {
        if (objectNatureza != null) {
            Natureza natureza = (Natureza) objectNatureza;
            return String.valueOf(natureza.getId());
        }
        return null;
    }
    
}
