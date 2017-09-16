package mxt.core;

import static org.bytedeco.javacpp.opencv_imgcodecs.*;
import static org.bytedeco.javacpp.opencv_core.*;
import static org.junit.Assert.*;
import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.*;
import org.bytedeco.javacv.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.indexer.*;
import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_calib3d.*;
import static org.bytedeco.javacpp.opencv_objdetect.*;
import java.io.File;

import org.bytedeco.javacpp.opencv_core.IplImage;
import org.junit.Test;

public class MainTest {
	@Test
	public void testName() throws Exception {
		File basedir = new File(
				"C:\\Users\\jespe\\OneDrive\\Documents\\GitHub\\mexican\\mxt.core");

		File filename = new File(basedir, "src/test/resources/IMG_0648.JPG");

		assertTrue(filename.exists());
		IplImage image = cvLoadImage(filename.toString());
		assertNotNull(image);

		if (image != null) {
			// cvSmooth(image, image);
			// cvSaveImage(filename_smooth.toString(), image);
			// cvReleaseImage(image);

		}
	}
}
