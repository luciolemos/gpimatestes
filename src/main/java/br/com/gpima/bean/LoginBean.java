package br.com.gpima.bean;

import br.com.gpima.domain.Login;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@RequestScoped
@ManagedBean(name = "loginBean")
public class LoginBean {

    private Login login;
    private String user;
    private String senha;

    public String entrar() {
        FacesContext context = FacesContext.getCurrentInstance();
        if (user.equals("user") && senha.equals("user")) {
            login = new Login(user, senha);
            HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
            session.setAttribute("login", login);
//            session.setAttribute("usuarioLogado", true);
            return "pages/militar?faces-redirect=true";
        } else {
            
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Info", "Digite nome de usuario e senha corretamente!");
            context.addMessage(null, message);
        }
        return null;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
