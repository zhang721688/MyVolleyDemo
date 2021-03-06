package moon.volley.api;

import android.graphics.Bitmap;

import com.android.volley.Request;

import java.util.ArrayList;
import java.util.List;

import moon.volley.form.FormImage;
import moon.volley.network.Constant;
import moon.volley.network.PostUploadRequest;
import moon.volley.network.ResponseListener;
import moon.volley.network.VolleyUtil;

/**
 * Created by moon.zhong on 2015/3/2.
 */
public class UploadApi {

    /**
     * 上传图片接口
     * @param bitmap 需要上传的图片
     * @param listener 请求回调
     */
    public static void uploadImg(Bitmap bitmap,ResponseListener listener){
        List<FormImage> imageList = new ArrayList<FormImage>() ;
        imageList.add(new FormImage(bitmap)) ;
        Request request = new PostUploadRequest(Constant.UploadHost,imageList,listener) ;
        VolleyUtil.getRequestQueue().add(request) ;
    }
}
