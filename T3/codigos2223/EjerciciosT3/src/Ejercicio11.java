public class Ejercicio11 {

    public static void main(String[] args) {
        int n1=6, n2=2, n3=4;
        int max=0, min=0, interm=0;
        boolean orden = false;
        // false --> menos a mayor
        // true --> mayor a menor

          if (n1>n2 && n1 >n3){
              max = n1;
              if (n2<n3){
                  min = n2;
                  interm = n3;
              } else if (n3<n2) {
                  min = n3;
                  interm = n2;
              }
          }
          else if (n2>n1 && n2 >n3){
              max = n2;
              if (n1<n3){
                  min = n1;
                  interm = n3;
              } else if (n3<n1) {
                  min = n3;
                  interm = n1;
              }
          }
          else if (n3>n1 && n3 >n2){
              max = n3;
              if (n1<n2){
                  min = n1;
                  interm = n2;
              } else if (n2<n1) {
                  min = n2;
                  interm = n1;
              }
          }

    }
}
