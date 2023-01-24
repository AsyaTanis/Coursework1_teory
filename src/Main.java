public class Main{
    /*Дан массив пар названий книг и авторов, необходимо привести каждую пару в строку вида:
     «Название книги» И.О.Автора.*/
    public static void main(String[] arg){
        String [][] array = new String[][]{{"Капитанская дочка","А.С.Пушкин"},{"Война и мир","Л.Н.Толстой"}};
        connectingStrings(array);
    }
    public static void connectingStrings(String [][] arr){
        for(byte i = 0; i < arr.length; i++){
            System.out.println("«" + arr[i][0] +"» " +  arr[i][1]);
        }
    }
}