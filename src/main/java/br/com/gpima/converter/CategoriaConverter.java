package br.com.gpima.converter;

import br.com.gpima.dao.CategoriaDAO;
import br.com.gpima.domain.Categoria;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "categoriaConverter", forClass = Categoria.class)
public class CategoriaConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringCategoria) {
        if (stringCategoria != null) {
            int id = Integer.parseInt(stringCategoria);
            CategoriaDAO dao = new CategoriaDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectCategoria) {
        if (objectCategoria != null) {
            Categoria categoria = (Categoria) objectCategoria;
            return String.valueOf(categoria.getId());
        }
        return null;
    }
    
}
