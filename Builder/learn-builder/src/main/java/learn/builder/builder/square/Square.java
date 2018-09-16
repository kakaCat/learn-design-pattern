package learn.builder.builder.square;

/**
 * Created by JAVA on 2018/7/28.
 */
public class Square {
    private int color;

    private int borderSize;

    private Square(Builder builder){
        this.color=builder.color;
        this.borderSize = builder.borderSize;

    }

    public static class Builder{
        public Square builder(){
            return new Square(this);
        }


        private int color;

        private int borderSize;



        public Builder setColor(int color) {
            this.color = color;
            return this;
        }



        public Builder setBorderSize(int borderSize) {
            this.borderSize = borderSize;
            return this;
        }
    }





}
