package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.MeasureSpec;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzmq;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class zzc
  extends zzi
  implements AudioManager.OnAudioFocusChangeListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener
{
  private static final Map zzDN;
  private final zzt zzDO;
  private int zzDP = 0;
  private int zzDQ = 0;
  private MediaPlayer zzDR;
  private Uri zzDS;
  private int zzDT;
  private int zzDU;
  private int zzDV;
  private int zzDW;
  private int zzDX;
  private float zzDY = 1.0F;
  private boolean zzDZ;
  private boolean zzEa;
  private int zzEb;
  private zzh zzEc;
  
  static
  {
    HashMap localHashMap = new HashMap();
    zzDN = localHashMap;
    localHashMap.put(Integer.valueOf(64532), "MEDIA_ERROR_IO");
    zzDN.put(Integer.valueOf(64529), "MEDIA_ERROR_MALFORMED");
    zzDN.put(Integer.valueOf(64526), "MEDIA_ERROR_UNSUPPORTED");
    zzDN.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
    zzDN.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
    zzDN.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
    zzDN.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
    zzDN.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
    zzDN.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
    zzDN.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
    zzDN.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
    zzDN.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
    zzDN.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
    zzDN.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
    zzDN.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
    zzDN.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
  }
  
  public zzc(Context paramContext, zzt paramzzt)
  {
    super(paramContext);
    setSurfaceTextureListener(this);
    zzDO = paramzzt;
    zzDO.zza(this);
  }
  
  private void zzb(float paramFloat)
  {
    if (zzDR != null) {}
    try
    {
      zzDR.setVolume(paramFloat, paramFloat);
      return;
    }
    catch (IllegalStateException localIllegalStateException) {}
    zzin.zzaK("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
    return;
  }
  
  private void zzfa()
  {
    zzin.v("AdMediaPlayerView init MediaPlayer");
    SurfaceTexture localSurfaceTexture = getSurfaceTexture();
    if ((zzDS == null) || (localSurfaceTexture == null)) {
      return;
    }
    zzv(false);
    try
    {
      zzDR = new MediaPlayer();
      zzDR.setOnBufferingUpdateListener(this);
      zzDR.setOnCompletionListener(this);
      zzDR.setOnErrorListener(this);
      zzDR.setOnInfoListener(this);
      zzDR.setOnPreparedListener(this);
      zzDR.setOnVideoSizeChangedListener(this);
      zzDV = 0;
      zzDR.setDataSource(getContext(), zzDS);
      zzDR.setSurface(new Surface(localSurfaceTexture));
      zzDR.setAudioStreamType(3);
      zzDR.setScreenOnWhilePlaying(true);
      zzDR.prepareAsync();
      zzw(1);
      return;
    }
    catch (IOException localIOException)
    {
      zzin.zzd("Failed to initialize MediaPlayer at " + zzDS, localIOException);
      onError(zzDR, 1, 0);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;) {}
    }
  }
  
  private void zzfb()
  {
    if ((zzfe()) && (zzDR.getCurrentPosition() > 0) && (zzDQ != 3))
    {
      zzin.v("AdMediaPlayerView nudging MediaPlayer");
      zzb(0.0F);
      zzDR.start();
      int i = zzDR.getCurrentPosition();
      long l = zzr.zzbG().currentTimeMillis();
      while ((zzfe()) && (zzDR.getCurrentPosition() == i) && (zzr.zzbG().currentTimeMillis() - l <= 250L)) {}
      zzDR.pause();
      zzfj();
    }
  }
  
  private void zzfc()
  {
    AudioManager localAudioManager = zzfk();
    if ((localAudioManager != null) && (!zzEa))
    {
      if (localAudioManager.requestAudioFocus(this, 3, 2) == 1) {
        zzfh();
      }
    }
    else {
      return;
    }
    zzin.zzaK("AdMediaPlayerView audio focus request failed");
  }
  
  private void zzfd()
  {
    zzin.v("AdMediaPlayerView abandon audio focus");
    AudioManager localAudioManager = zzfk();
    if ((localAudioManager != null) && (zzEa))
    {
      if (localAudioManager.abandonAudioFocus(this) == 1) {
        zzEa = false;
      }
    }
    else {
      return;
    }
    zzin.zzaK("AdMediaPlayerView abandon audio focus failed");
  }
  
  private boolean zzfe()
  {
    return (zzDR != null) && (zzDP != -1) && (zzDP != 0) && (zzDP != 1);
  }
  
  private void zzfh()
  {
    zzin.v("AdMediaPlayerView audio focus gained");
    zzEa = true;
    zzfj();
  }
  
  private void zzfi()
  {
    zzin.v("AdMediaPlayerView audio focus lost");
    zzEa = false;
    zzfj();
  }
  
  private void zzfj()
  {
    if ((!zzDZ) && (zzEa))
    {
      zzb(zzDY);
      return;
    }
    zzb(0.0F);
  }
  
  private AudioManager zzfk()
  {
    return (AudioManager)getContext().getSystemService("audio");
  }
  
  private void zzv(boolean paramBoolean)
  {
    zzin.v("AdMediaPlayerView release");
    if (zzDR != null)
    {
      zzDR.reset();
      zzDR.release();
      zzDR = null;
      zzw(0);
      if (paramBoolean)
      {
        zzDQ = 0;
        zzDQ = 0;
      }
      zzfd();
    }
  }
  
  private void zzw(int paramInt)
  {
    if (paramInt == 3) {
      zzDO.zzfO();
    }
    for (;;)
    {
      zzDP = paramInt;
      return;
      if ((zzDP == 3) && (paramInt != 3)) {
        zzDO.zzfP();
      }
    }
  }
  
  private void zzx(int paramInt)
  {
    zzDQ = paramInt;
  }
  
  public int getCurrentPosition()
  {
    if (zzfe()) {
      return zzDR.getCurrentPosition();
    }
    return 0;
  }
  
  public int getDuration()
  {
    if (zzfe()) {
      return zzDR.getDuration();
    }
    return -1;
  }
  
  public int getVideoHeight()
  {
    if (zzDR != null) {
      return zzDR.getVideoHeight();
    }
    return 0;
  }
  
  public int getVideoWidth()
  {
    if (zzDR != null) {
      return zzDR.getVideoWidth();
    }
    return 0;
  }
  
  public void onAudioFocusChange(int paramInt)
  {
    if (paramInt > 0) {
      zzfh();
    }
    while (paramInt >= 0) {
      return;
    }
    zzfi();
  }
  
  public void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt)
  {
    zzDV = paramInt;
  }
  
  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    zzin.v("AdMediaPlayerView completion");
    zzw(5);
    zzDQ = 5;
    zzir.zzMc.post(new zzc.2(this));
  }
  
  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    paramMediaPlayer = (String)zzDN.get(Integer.valueOf(paramInt1));
    String str = (String)zzDN.get(Integer.valueOf(paramInt2));
    zzin.zzaK("AdMediaPlayerView MediaPlayer error: " + paramMediaPlayer + ":" + str);
    zzw(-1);
    zzx(-1);
    zzir.zzMc.post(new zzc.3(this, paramMediaPlayer, str));
    return true;
  }
  
  public boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    paramMediaPlayer = (String)zzDN.get(Integer.valueOf(paramInt1));
    String str = (String)zzDN.get(Integer.valueOf(paramInt2));
    zzin.v("AdMediaPlayerView MediaPlayer info: " + paramMediaPlayer + ":" + str);
    return true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int k = getDefaultSize(zzDT, paramInt1);
    int m = getDefaultSize(zzDU, paramInt2);
    int j = m;
    int i = k;
    int n;
    if (zzDT > 0)
    {
      j = m;
      i = k;
      if (zzDU > 0)
      {
        m = View.MeasureSpec.getMode(paramInt1);
        paramInt1 = View.MeasureSpec.getSize(paramInt1);
        n = View.MeasureSpec.getMode(paramInt2);
        paramInt2 = View.MeasureSpec.getSize(paramInt2);
        if ((m != 1073741824) || (n != 1073741824)) {
          break label211;
        }
        if (zzDT * paramInt2 >= zzDU * paramInt1) {
          break label178;
        }
        i = zzDT * paramInt2 / zzDU;
        j = paramInt2;
      }
    }
    for (;;)
    {
      setMeasuredDimension(i, j);
      if (Build.VERSION.SDK_INT == 16)
      {
        if (((zzDW > 0) && (zzDW != i)) || ((zzDX > 0) && (zzDX != j))) {
          zzfb();
        }
        zzDW = i;
        zzDX = j;
      }
      return;
      label178:
      if (zzDT * paramInt2 > zzDU * paramInt1)
      {
        j = zzDU * paramInt1 / zzDT;
        i = paramInt1;
        continue;
        label211:
        if (m == 1073741824)
        {
          j = zzDU * paramInt1 / zzDT;
          if ((n == Integer.MIN_VALUE) && (j > paramInt2))
          {
            j = paramInt2;
            i = paramInt1;
          }
        }
        else
        {
          if (n == 1073741824)
          {
            k = zzDT * paramInt2 / zzDU;
            j = paramInt2;
            i = k;
            if (m != Integer.MIN_VALUE) {
              continue;
            }
            j = paramInt2;
            i = k;
            if (k <= paramInt1) {
              continue;
            }
            j = paramInt2;
            i = paramInt1;
            continue;
          }
          k = zzDT;
          i = zzDU;
          if ((n == Integer.MIN_VALUE) && (i > paramInt2)) {
            k = zzDT * paramInt2 / zzDU;
          }
          for (;;)
          {
            j = paramInt2;
            i = k;
            if (m != Integer.MIN_VALUE) {
              break;
            }
            j = paramInt2;
            i = k;
            if (k <= paramInt1) {
              break;
            }
            j = zzDU * paramInt1 / zzDT;
            i = paramInt1;
            break;
            paramInt2 = i;
          }
        }
        i = paramInt1;
      }
      else
      {
        j = paramInt2;
        i = paramInt1;
      }
    }
  }
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    zzin.v("AdMediaPlayerView prepared");
    zzw(2);
    zzDO.zzfz();
    zzir.zzMc.post(new zzc.1(this));
    zzDT = paramMediaPlayer.getVideoWidth();
    zzDU = paramMediaPlayer.getVideoHeight();
    if (zzEb != 0) {
      seekTo(zzEb);
    }
    zzfb();
    zzin.zzaJ("AdMediaPlayerView stream dimensions: " + zzDT + " x " + zzDU);
    if (zzDQ == 3) {
      play();
    }
    zzfc();
    zzfj();
  }
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    zzin.v("AdMediaPlayerView surface created");
    zzfa();
    zzir.zzMc.post(new zzc.4(this));
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    zzin.v("AdMediaPlayerView surface destroyed");
    if ((zzDR != null) && (zzEb == 0)) {
      zzEb = zzDR.getCurrentPosition();
    }
    zzir.zzMc.post(new zzc.5(this));
    zzv(true);
    return true;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    int j = 1;
    zzin.v("AdMediaPlayerView surface changed");
    int i;
    if (zzDQ == 3)
    {
      i = 1;
      if ((zzDT != paramInt1) || (zzDU != paramInt2)) {
        break label81;
      }
    }
    label81:
    for (paramInt1 = j;; paramInt1 = 0)
    {
      if ((zzDR != null) && (i != 0) && (paramInt1 != 0))
      {
        if (zzEb != 0) {
          seekTo(zzEb);
        }
        play();
      }
      return;
      i = 0;
      break;
    }
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
    zzDO.zzb(this);
  }
  
  public void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    zzin.v("AdMediaPlayerView size changed: " + paramInt1 + " x " + paramInt2);
    zzDT = paramMediaPlayer.getVideoWidth();
    zzDU = paramMediaPlayer.getVideoHeight();
    if ((zzDT != 0) && (zzDU != 0)) {
      requestLayout();
    }
  }
  
  public void pause()
  {
    zzin.v("AdMediaPlayerView pause");
    if ((zzfe()) && (zzDR.isPlaying()))
    {
      zzDR.pause();
      zzw(4);
      zzir.zzMc.post(new zzc.7(this));
    }
    zzDQ = 4;
  }
  
  public void play()
  {
    zzin.v("AdMediaPlayerView play");
    if (zzfe())
    {
      zzDR.start();
      zzw(3);
      zzir.zzMc.post(new zzc.6(this));
    }
    zzDQ = 3;
  }
  
  public void seekTo(int paramInt)
  {
    zzin.v("AdMediaPlayerView seek " + paramInt);
    if (zzfe())
    {
      zzDR.seekTo(paramInt);
      zzEb = 0;
      return;
    }
    zzEb = paramInt;
  }
  
  public void setMimeType(String paramString) {}
  
  public void setVideoPath(String paramString)
  {
    setVideoURI(Uri.parse(paramString));
  }
  
  public void setVideoURI(Uri paramUri)
  {
    zzDS = paramUri;
    zzEb = 0;
    zzfa();
    requestLayout();
    invalidate();
  }
  
  public void stop()
  {
    zzin.v("AdMediaPlayerView stop");
    if (zzDR != null)
    {
      zzDR.stop();
      zzDR.release();
      zzDR = null;
      zzw(0);
      zzDQ = 0;
      zzfd();
    }
    zzDO.onStop();
  }
  
  public String toString()
  {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
  }
  
  public void zza(float paramFloat)
  {
    zzDY = paramFloat;
    zzfj();
  }
  
  public void zza(zzh paramzzh)
  {
    zzEc = paramzzh;
  }
  
  public String zzeZ()
  {
    return "MediaPlayer";
  }
  
  public void zzff()
  {
    zzDZ = true;
    zzfj();
  }
  
  public void zzfg()
  {
    zzDZ = false;
    zzfj();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */