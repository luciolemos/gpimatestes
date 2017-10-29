package br.com.gpima.converter;

import br.com.gpima.dao.ImovelDAO;
import br.com.gpima.domain.Imovel;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "imovelConverter", forClass = Imovel.class)
public class ImovelConverter implements Converter {
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringImovel) {
        if (stringImovel != null) {
            int id = Integer.parseInt(stringImovel);
            ImovelDAO dao = new ImovelDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectImovel) {
        if (objectImovel != null) {
            Imovel cliente = (Imovel) objectImovel;
            return String.valueOf(cliente.getId());
        }
        return null;
    }
    
}
