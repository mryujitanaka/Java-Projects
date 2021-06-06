import java.awt.*;
public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Resolucao da tela:");
        System.out.println(d.width + "x" + d.height);
    }
}