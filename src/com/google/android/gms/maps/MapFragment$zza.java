package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzac;
import com.google.android.gms.maps.model.RuntimeRemoteException;

class MapFragment$zza
  implements MapLifecycleDelegate
{
  private final IMapFragmentDelegate zzaSe;
  private final Fragment zzavH;
  
  public MapFragment$zza(Fragment paramFragment, IMapFragmentDelegate paramIMapFragmentDelegate)
  {
    zzaSe = ((IMapFragmentDelegate)zzx.zzz(paramIMapFragmentDelegate));
    zzavH = ((Fragment)zzx.zzz(paramFragment));
  }
  
  public void getMapAsync(OnMapReadyCallback paramOnMapReadyCallback)
  {
    try
    {
      zzaSe.getMapAsync(new MapFragment.zza.1(this, paramOnMapReadyCallback));
      return;
    }
    catch (RemoteException paramOnMapReadyCallback)
    {
      throw new RuntimeRemoteException(paramOnMapReadyCallback);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {}
    try
    {
      localBundle = new Bundle();
      paramBundle = zzavH.getArguments();
      if ((paramBundle != null) && (paramBundle.containsKey("MapOptions"))) {
        zzac.zza(localBundle, "MapOptions", paramBundle.getParcelable("MapOptions"));
      }
      zzaSe.onCreate(localBundle);
      return;
    }
    catch (RemoteException paramBundle)
    {
      throw new RuntimeRemoteException(paramBundle);
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    try
    {
      paramLayoutInflater = zzaSe.onCreateView(zze.zzC(paramLayoutInflater), zze.zzC(paramViewGroup), paramBundle);
      return (View)zze.zzp(paramLayoutInflater);
    }
    catch (RemoteException paramLayoutInflater)
    {
      throw new RuntimeRemoteException(paramLayoutInflater);
    }
  }
  
  public void onDestroy()
  {
    try
    {
      zzaSe.onDestroy();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void onDestroyView()
  {
    try
    {
      zzaSe.onDestroyView();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void onEnterAmbient(Bundle paramBundle)
  {
    try
    {
      zzaSe.onEnterAmbient(paramBundle);
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
      zzaSe.onExitAmbient();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
  }
  
  public void onInflate(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
    paramBundle1 = (GoogleMapOptions)paramBundle1.getParcelable("MapOptions");
    try
    {
      zzaSe.onInflate(zze.zzC(paramActivity), paramBundle1, paramBundle2);
      return;
    }
    catch (RemoteException paramActivity)
    {
      throw new RuntimeRemoteException(paramActivity);
    }
  }
  
  public void onLowMemory()
  {
    try
    {
      zzaSe.onLowMemory();
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
      zzaSe.onPause();
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
      zzaSe.onResume();
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
      zzaSe.onSaveInstanceState(paramBundle);
      return;
    }
    catch (RemoteException paramBundle)
    {
      throw new RuntimeRemoteException(paramBundle);
    }
  }
  
  public void onStart() {}
  
  public void onStop() {}
  
  public IMapFragmentDelegate zzzV()
  {
    return zzaSe;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.MapFragment.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */