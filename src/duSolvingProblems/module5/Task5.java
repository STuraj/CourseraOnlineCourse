package duSolvingProblems.module5;

public class Task5 {

        public static void main(String[] args) {
            String[] files = {"cat.png", "tree.png", "car.png"};
            for (String fname : files) {
                ImageResource original = new ImageResource(fname);
                ImageResource grayVersion = makeGray(original);
                grayVersion.draw();
            }
            System.out.println("done");
        }

        // Dummy stand-ins so this code focuses on the sequence of draw calls
        static class ImageResource {
            String name;
            ImageResource(String n) { name = n; }
            void draw() { /* draws the image for this file */ }
        }

        static ImageResource makeGray(ImageResource inImage) {
            // returns a new grayscale ImageResource based on inImage
            return new ImageResource("gray-" + inImage.name);
        }
    }


