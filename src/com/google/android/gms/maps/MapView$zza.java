package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

class MapView$zza
  implements MapLifecycleDelegate
{
  private final ViewGroup zzaSk;
  private final IMapViewDelegate zzaSl;
  private View zzaSm;
  
  public MapView$zza(ViewGroup paramViewGroup, IMapViewDelegate paramIMapViewDelegate)
  {
    zzaSl = ((IMapViewDelegate)zzx.zzz(paramIMapViewDelegate));
    zzaSk = ((ViewGroup)zzx.zzz(paramViewGroup));
  }
  
  public void getMapAsync(OnMapReadyCallback paramOnMapReadyCallback)
  {
    try
    {
      zzaSl.getMapAsync(new MapView.zza.1(this, paramOnMapReadyCallback));
      return;
    }
    catch (RemoteException paramOnMapReadyCallback)
    {
      throw new RuntimeRemoteException(paramOnMapReadyCallback);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    try
    {
      zzaSl.onCreate(paramBundle);
      zzaSm = ((View)zze.zzp(zzaSl.getView()));
      zzaSk.removeAllViews();
      zzaSk.addView(zzaSm);
      return;
    }
    catch (RemoteException paramBundle)
    {
      throw new RuntimeRemoteException(paramBundle);
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
  }
  
  public void onDestroy()
  {
    try
    {
      zzaSl.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void onDestroyView()
  {
    throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
  }
  
  public void onEnterAmbient(Bundle paramBundle)
  {
    try
    {
      zzaSl.onEnterAmbient(paramBundle);
      return;
    }
    catch (RemoteException paramBundle)
    {
      throw new RuntimeRemoteException(paramBundle);
    }
  }
  
  public void onExitAmbient()
  {
    try
    {
      zzaSl.onExitAmbient();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void onInflate(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
    throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
  }
  
  public void onLowMemory()
  {
    try
    {
      zzaSl.onLowMemory();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void onPause()
  {
    try
    {
      zzaSl.onPause();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void onResume()
  {
    try
    {
      zzaSl.onResume();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    try
    {
      zzaSl.onSaveInstanceState(paramBundle);
      return;
    }
    catch (RemoteException paramBundle)
    {
      throw new RuntimeRemoteException(paramBundle);
    }
  }
  
  public void onStart() {}
  
  public void onStop() {}
  
  public IMapViewDelegate zzzX()
  {
    return zzaSl;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.MapView.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */