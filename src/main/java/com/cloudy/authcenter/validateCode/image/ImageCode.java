package com.cloudy.authcenter.validateCode.image;



import com.cloudy.authcenter.validateCode.ValidateCode;

import java.awt.image.BufferedImage;

/**
 * Created by ljy_cloudy on 2018/10/8.
 */
public class ImageCode extends ValidateCode {
    private BufferedImage image;


    public ImageCode(BufferedImage image, String code, int expireIn) {
        super(code, expireIn);
        this.image = image;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }


}
