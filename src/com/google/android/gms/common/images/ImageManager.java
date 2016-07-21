package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.internal.zzmd;
import com.google.android.gms.internal.zzne;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager
{
  private static HashSet zzajA = new HashSet();
  private static ImageManager zzajB;
  private static ImageManager zzajC;
  private static final Object zzajz = new Object();
  private final Context mContext;
  private final Handler mHandler;
  private final ExecutorService zzajD;
  private final ImageManager.zzb zzajE;
  private final zzmd zzajF;
  private final Map zzajG;
  private final Map zzajH;
  private final Map zzajI;
  
  private ImageManager(Context paramContext, boolean paramBoolean)
  {
    mContext = paramContext.getApplicationContext();
    mHandler = new Handler(Looper.getMainLooper());
    zzajD = Executors.newFixedThreadPool(4);
    if (paramBoolean)
    {
      zzajE = new ImageManager.zzb(mContext);
      if (zzne.zzsg()) {
        zzqj();
      }
    }
    for (;;)
    {
      zzajF = new zzmd();
      zzajG = new HashMap();
      zzajH = new HashMap();
      zzajI = new HashMap();
      return;
      zzajE = null;
    }
  }
  
  public static ImageManager create(Context paramContext)
  {
    return zzc(paramContext, false);
  }
  
  private Bitmap zza(zza.zza paramzza)
  {
    if (zzajE == null) {
      return null;
    }
    return (Bitmap)zzajE.get(paramzza);
  }
  
  public static ImageManager zzc(Context paramContext, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (zzajC == null) {
        zzajC = new ImageManager(paramContext, true);
      }
      return zzajC;
    }
    if (zzajB == null) {
      zzajB = new ImageManager(paramContext, false);
    }
    return zzajB;
  }
  
  private void zzqj()
  {
    mContext.registerComponentCallbacks(new ImageManager.zze(zzajE));
  }
  
  public final void loadImage(ImageView paramImageView, int paramInt)
  {
    zza(new zza.zzb(paramImageView, paramInt));
  }
  
  public final void loadImage(ImageView paramImageView, Uri paramUri)
  {
    zza(new zza.zzb(paramImageView, paramUri));
  }
  
  public final void loadImage(ImageView paramImageView, Uri paramUri, int paramInt)
  {
    paramImageView = new zza.zzb(paramImageView, paramUri);
    paramImageView.zzbM(paramInt);
    zza(paramImageView);
  }
  
  public final void loadImage(ImageManager.OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri)
  {
    zza(new zza.zzc(paramOnImageLoadedListener, paramUri));
  }
  
  public final void loadImage(ImageManager.OnImageLoadedListener paramOnImageLoadedListener, Uri paramUri, int paramInt)
  {
    paramOnImageLoadedListener = new zza.zzc(paramOnImageLoadedListener, paramUri);
    paramOnImageLoadedListener.zzbM(paramInt);
    zza(paramOnImageLoadedListener);
  }
  
  public final void zza(zza paramzza)
  {
    zzb.zzcD("ImageManager.loadImage() must be called in the main thread");
    new ImageManager.zzd(this, paramzza).run();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.images.ImageManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */