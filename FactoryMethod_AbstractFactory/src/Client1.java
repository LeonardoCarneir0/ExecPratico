import factory.ComputerStore;
import factory.NotebookStore;
import factory.PlaystationPortableStore;
import factory.PlaystationStore;
import factory.ProductStore;

public class Client1 {

    public static void main(String[] args) {

        ProductStore computerStore = new ComputerStore();
        computerStore.orderProduct();

        System.out.println();

        ProductStore notebookStore = new NotebookStore();
        notebookStore.orderProduct();

        System.out.println();

        ProductStore playstationStore = new PlaystationStore();
        playstationStore.orderProduct();

        System.out.println();

        ProductStore pspStore = new PlaystationPortableStore();
        pspStore.orderProduct();
    }
}