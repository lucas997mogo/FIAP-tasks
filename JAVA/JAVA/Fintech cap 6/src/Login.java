public class Login {

    private String username;

    private String password;



    // Construtor padrão

    public Login() {

    }



    // Construtor com parâmetros

    public Login(String username, String password) {

        this.username = username;

        this.password = password;

    }









    // Exemplo de método

    public void doLogin() {

        // Lógica para realizar o login

        System.out.println("Realizando login para o usuário: " + username);

    }

}

