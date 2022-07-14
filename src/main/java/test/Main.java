package test;

public class Main {
    public static void main(String[] args) {
        Base base = new Base();

        Client c = new Client();
        ClientPremium cp = new ClientPremium();
        ClientVIP cv = new ClientVIP();



        base.clients[0] = c;
        base.clients[1] = cp;
        base.clients[2] = cv;

        System.out.println("-----------");

        for (int i = 0; i < base.clients.length; i++) {
            if(base.clients[i] instanceof Client){
                System.out.println("Client");
            } else if (base.clients[i] instanceof ClientPremium) {
                System.out.println("Client premium");
            } else if(base.clients[i] instanceof ClientVIP) {
                System.out.println("Client VIP");
            } else {
                System.out.println("Not found");
            }
        }

    }
}
