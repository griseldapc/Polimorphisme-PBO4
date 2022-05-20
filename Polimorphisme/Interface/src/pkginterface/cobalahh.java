package pkginterface;
public class cobalahh {
    public static void main(String[] args) {
     Line coba = new Line(2.5,3,4,5) {
         @Override
         public boolean isEqual(Object a, Object b) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
     } ;
     Line pertama = new Line(3,4,5,6) {
         @Override
         public boolean isEqual(Object a, Object b) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
     };
     coba.getLength();
     coba.isGreater(coba, pertama);
        System.out.println(coba.isGreater(coba, pertama));
    }
}
