package vn.jupiter.universalvideoview

import android.view.SurfaceView
import android.view.TextureView

interface VideoPlayer {
    fun prepare()
    fun play()
    fun pause()
    fun stop()
    fun release()
    fun selectTrack()

    fun getDuration(): Long
    fun getCurrentPosition(): Long
    fun getCurrentBufferedPosition(): Long
    fun seekTo(positionInMs: Long)

    fun setVideoSurfaceView(surfaceView: SurfaceView) {

    }

    fun setVideoTextureView(textureView: TextureView) {

    }
}