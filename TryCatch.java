class Calculadora {

    public float divide(int a, int b) {
        try {
            float res = a / b;
            System.out.println(res);
            return res;
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero!");
        } catch (NullPointerException e) {
            System.out.println("Divisão por zero!");
        } //Essa captadora de excessão deve ser a ultima
        catch (Exception e) {
            System.out.println("Excessão genérica!");
        } finally {
            //Sempre será executado
            //disparando uma excessão ou não
            System.out.println("finally executado!");
        }
        return Float.POSITIVE_INFINITY;

    }
}
/*
public class TryCatch {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        //System.out.println(c.divide(8,0));
        Imc pessoa1 = new Imc();
        float a, p;
        System.out.print("Digite o peso: ");
        a = pessoa1.leitor();
        System.out.print("Digite a altura: ");
        p = pessoa1.leitor();
        System.out.println("Seu imc é: " + pessoa1.calImc(a, p));

    }

}
*/