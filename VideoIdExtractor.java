/**
Created by DidDog on 28.12.2021 11:01 am
**/
package diddog.youtube;

import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.*;
import java.lang.String;

public class VideoIDExtractor {

	public static String getVideoId(String videoUrl) {
		String videoId = "";
		String regex = "http(?:s)?:\\/\\/(?:m.)?(?:www\\.)?youtu(?:\\.be\\/|be\\.com\\/(?:watch\\?(?:feature=youtu.be\\&)?v=|v\\/|embed\\/|user\\/(?:[\\w#]+\\/)+))([^&#?\\n]+)";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(videoUrl);
		if(matcher.find()){
			videoId = matcher.group(1);
		}
		return videoId;
	}

}
