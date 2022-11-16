package es.germinal;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl ();

    public static void main(String[] args) {

        Coche nissan = new Coche("nissan", "qasqai", 2002);

        cocheCRUD.save (nissan);
        cocheCRUD.findAll (nissan);
        cocheCRUD.delete (nissan);

        System.out.println (cocheCRUD);


    }
}
