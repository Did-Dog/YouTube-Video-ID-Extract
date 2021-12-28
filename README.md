# YouTube-Video-ID-Extract
Extract youtube videos id from Url or String in Java

## How to use 

```
import diddog.youtube.*;

String url = "http://www.youtube.com/watch?v=0zM4nApSvMg&feature=feedrec_grec_index";
String videoId = VideoIDExtractor.getVideoId();

```
 Then videoID = 0zM4nApSvMg


## Tested on these urls
- http://www.youtube.com/watch?v=0zM4nApSvMg&feature=feedrec_grec_index
- http://www.youtube.com/user/SomeUser#p/a/u/1/QDK8U-VIH_o
- http://www.youtube.com/v/0zM4nApSvMg?fs=1&amp;hl=en_US&amp;rel=0
- http://www.youtube.com/watch?v=0zM4nApSvMg#t=0m10s
- http://www.youtube.com/embed/0zM4nApSvMg?rel=0
- http://www.youtube.com/watch?v=0zM4nApSvMg
- http://youtu.be/0zM4nApSvMg
- https://www.youtube.com/watch?v=nBuae6ilH24
- https://www.youtube.com/watch?v=pJegNopBLL8
- http://www.youtube.com/watch?v=0zM4nApSvMg#t=0m10s
- https://www.youtube.com/watch?v=0zM4nApSvMg&feature=youtu.be
- https://www.youtube.com/watch?v=_5BTo2oZ0SE
- https://m.youtube.com/watch?feature=youtu.be&v=_5BTo2oZ0SE
- https://m.youtube.com/watch?v=_5BTo2oZ0SE
- https://www.youtube.com/watch?feature=youtu.be&v=_5BTo2oZ0SE&app=desktop
- https://www.youtube.com/watch?v=nBuae6ilH24
- https://www.youtube.com/watch?v=eLlxrBmD3H4
