package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class MapView
  extends FrameLayout
{
  private GoogleMap zzaSd;
  private final MapView.zzb zzaSj;
  
  public MapView(Context paramContext)
  {
    super(paramContext);
    zzaSj = new MapView.zzb(this, paramContext, null);
    zzex();
  }
  
  public MapView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    zzaSj = new MapView.zzb(this, paramContext, GoogleMapOptions.createFromAttributes(paramContext, paramAttributeSet));
    zzex();
  }
  
  public MapView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    zzaSj = new MapView.zzb(this, paramContext, GoogleMapOptions.createFromAttributes(paramContext, paramAttributeSet));
    zzex();
  }
  
  public MapView(Context paramContext, GoogleMapOptions paramGoogleMapOptions)
  {
    super(paramContext);
    zzaSj = new MapView.zzb(this, paramContext, paramGoogleMapOptions);
    zzex();
  }
  
  private void zzex()
  {
    setClickable(true);
  }
  
  public final GoogleMap getMap()
  {
    if (zzaSd != null) {
      return zzaSd;
    }
    zzaSj.zzzW();
    if (zzaSj.zztU() == null) {
      return null;
    }
    try
    {
      zzaSd = new GoogleMap(((MapView.zza)zzaSj.zztU()).zzzX().getMap());
      return zzaSd;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void getMapAsync(OnMapReadyCallback paramOnMapReadyCallback)
  {
    zzx.zzcD("getMapAsync() must be called on the main thread");
    zzaSj.getMapAsync(paramOnMapReadyCallback);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    zzaSj.onCreate(paramBundle);
    if (zzaSj.zztU() == null) {
      zza.zzb(this);
    }
  }
  
  public final void onDestroy()
  {
    zzaSj.onDestroy();
  }
  
  public final void onEnterAmbient(Bundle paramBundle)
  {
    zzx.zzcD("onEnterAmbient() must be called on the main thread");
    zzaSj.onEnterAmbient(paramBundle);
  }
  
  public final void onExitAmbient()
  {
    zzx.zzcD("onExitAmbient() must be called on the main thread");
    zzaSj.onExitAmbient();
  }
  
  public final void onLowMemory()
  {
    zzaSj.onLowMemory();
  }
  
  public final void onPause()
  {
    zzaSj.onPause();
  }
  
  public final void onResume()
  {
    zzaSj.onResume();
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    zzaSj.onSaveInstanceState(paramBundle);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.MapView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */