package br.com.gpima.converter;

import br.com.gpima.dao.FuncaoDAO;
import br.com.gpima.domain.Funcao;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "funcaoConverter", forClass = Funcao.class)
public class FuncaoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringFuncao) {
        if (stringFuncao != null) {
            int id = Integer.parseInt(stringFuncao);
            FuncaoDAO dao = new FuncaoDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectFuncao) {
        if (objectFuncao != null) {
            Funcao funcao = (Funcao) objectFuncao;
            return String.valueOf(funcao.getId());
        }
        return null;
    }
    
}
