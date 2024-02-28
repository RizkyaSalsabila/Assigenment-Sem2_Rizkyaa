public class Dragon24 {

    //Atribut
    int x, y, width, height;
    
    //method moveLeft()
    void moveLeft() {
        if (x > 0) {
            x -= 1;
        }
        printPosition();
    }

    //method moveRight()
    void moveRight() {
        if (x <= width) {
            x += 1;
        }
        printPosition();
    }
    
    //method moveUp()
    void moveUp() {
        if (y > 0) {
            y -= 1;
        }
        printPosition();
    }

    //method moveDown()
    void moveDown() {
        if (y <= height) {
            y += 1;
        }
        printPosition();
    }

    //method printPosition()
    void printPosition() {
        System.out.printf("%d, %d\n", x, y);
    }

    //method detectCollision()
    void detectCollision() {
        if (x < 0 || x > width || y < 0 || y > height) {
            System.out.println("Game Over");
        }
    }
    public static void main(String[] args) {
        //Konstruktor
        Dragon24 d = new Dragon24();
        d.printPosition();
        d.moveRight();
        d.moveLeft();
        d.moveDown();
        d.moveUp();
    }
}
