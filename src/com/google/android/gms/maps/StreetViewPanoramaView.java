package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class StreetViewPanoramaView
  extends FrameLayout
{
  private final StreetViewPanoramaView.zzb zzaSK;
  private StreetViewPanorama zzaSy;
  
  public StreetViewPanoramaView(Context paramContext)
  {
    super(paramContext);
    zzaSK = new StreetViewPanoramaView.zzb(this, paramContext, null);
  }
  
  public StreetViewPanoramaView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    zzaSK = new StreetViewPanoramaView.zzb(this, paramContext, null);
  }
  
  public StreetViewPanoramaView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    zzaSK = new StreetViewPanoramaView.zzb(this, paramContext, null);
  }
  
  public StreetViewPanoramaView(Context paramContext, StreetViewPanoramaOptions paramStreetViewPanoramaOptions)
  {
    super(paramContext);
    zzaSK = new StreetViewPanoramaView.zzb(this, paramContext, paramStreetViewPanoramaOptions);
  }
  
  public final StreetViewPanorama getStreetViewPanorama()
  {
    if (zzaSy != null) {
      return zzaSy;
    }
    zzaSK.zzzW();
    if (zzaSK.zztU() == null) {
      return null;
    }
    try
    {
      zzaSy = new StreetViewPanorama(((StreetViewPanoramaView.zza)zzaSK.zztU()).zzAd().getStreetViewPanorama());
      return zzaSy;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback paramOnStreetViewPanoramaReadyCallback)
  {
    zzx.zzcD("getStreetViewPanoramaAsync() must be called on the main thread");
    zzaSK.getStreetViewPanoramaAsync(paramOnStreetViewPanoramaReadyCallback);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    zzaSK.onCreate(paramBundle);
    if (zzaSK.zztU() == null) {
      zza.zzb(this);
    }
  }
  
  public final void onDestroy()
  {
    zzaSK.onDestroy();
  }
  
  public final void onLowMemory()
  {
    zzaSK.onLowMemory();
  }
  
  public final void onPause()
  {
    zzaSK.onPause();
  }
  
  public final void onResume()
  {
    zzaSK.onResume();
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    zzaSK.onSaveInstanceState(paramBundle);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.StreetViewPanoramaView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */