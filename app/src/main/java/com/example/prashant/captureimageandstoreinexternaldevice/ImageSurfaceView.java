package com.example.prashant.captureimageandstoreinexternaldevice;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.Surface;
import android.view.SurfaceHolder;

/**
 * Created by Prashant on 9/28/2016.
 */
public class ImageSurfaceView extends Surface implements SurfaceHolder.Callback {
    /**
     * Create Surface from a {@link SurfaceTexture}.
     * <p/>
     * Images drawn to the Surface will be made available to the {@link
     * SurfaceTexture}, which can attach them to an OpenGL ES texture via {@link
     * SurfaceTexture#updateTexImage}.
     *
     * @param surfaceTexture The {@link SurfaceTexture} that is updated by this
     *                       Surface.
     * @throws OutOfResourcesException if the surface could not be created.
     */

    private Camera camera;
    private SurfaceHolder surfaceHolder;

    public ImageSurfaceView(Context context, Camera camera) {
        super(context);

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
