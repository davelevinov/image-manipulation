public class ImageEditing {
		
	
	   /**
		* Renders an image using StdDraw. 
		* The input array is assumed to contain integers in the range [0,255].
		* With the third dimension being of size 3.
		*
		* @param pic - the image to show.
		*/
	public static void show(int[][][] pic){
		StdDraw.setCanvasSize(pic[0].length, pic.length);
		int height = pic.length;
		int width = pic[0].length;
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);
		StdDraw.show(30);
		for (int i = 0; i < height; i++){
		    for (int j = 0; j < width; j++){
				StdDraw.setPenColor(pic[i][j][0], pic[i][j][1], pic[i][j][2] );
				StdDraw.filledRectangle(j + 0.5, height - i - 0.5, 0.5, 0.5);
		    }
		}
		StdDraw.show();
	}
}


