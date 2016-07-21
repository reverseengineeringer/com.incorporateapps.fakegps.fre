package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public class MapFragment
  extends Fragment
{
  private final MapFragment.zzb zzaSc = new MapFragment.zzb(this);
  private GoogleMap zzaSd;
  
  public static MapFragment newInstance()
  {
    return new MapFragment();
  }
  
  public static MapFragment newInstance(GoogleMapOptions paramGoogleMapOptions)
  {
    MapFragment localMapFragment = new MapFragment();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("MapOptions", paramGoogleMapOptions);
    localMapFragment.setArguments(localBundle);
    return localMapFragment;
  }
  
  public final GoogleMap getMap()
  {
    Object localObject = zzzV();
    if (localObject == null) {}
    for (;;)
    {
      return null;
      try
      {
        localObject = ((IMapFragmentDelegate)localObject).getMap();
        if (localObject == null) {
          continue;
        }
        if ((zzaSd == null) || (zzaSd.zzzJ().asBinder() != ((IGoogleMapDelegate)localObject).asBinder())) {
          zzaSd = new GoogleMap((IGoogleMapDelegate)localObject);
        }
        return zzaSd;
      }
      catch (RemoteException localRemoteException)
      {
        throw new RuntimeRemoteException(localRemoteException);
      }
    }
  }
  
  public void getMapAsync(OnMapReadyCallback paramOnMapReadyCallback)
  {
    zzx.zzcD("getMapAsync must be called on the main thread.");
    zzaSc.getMapAsync(paramOnMapReadyCallback);
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.setClassLoader(MapFragment.class.getClassLoader());
    }
    super.onActivityCreated(paramBundle);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    MapFragment.zzb.zza(zzaSc, paramActivity);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    zzaSc.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = zzaSc.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    paramLayoutInflater.setClickable(true);
    return paramLayoutInflater;
  }
  
  public void onDestroy()
  {
    zzaSc.onDestroy();
    super.onDestroy();
  }
  
  public void onDestroyView()
  {
    zzaSc.onDestroyView();
    super.onDestroyView();
  }
  
  public final void onEnterAmbient(Bundle paramBundle)
  {
    zzx.zzcD("onEnterAmbient must be called on the main thread.");
    zzaSc.onEnterAmbient(paramBundle);
  }
  
  public final void onExitAmbient()
  {
    zzx.zzcD("onExitAmbient must be called on the main thread.");
    zzaSc.onExitAmbient();
  }
  
  public void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.onInflate(paramActivity, paramAttributeSet, paramBundle);
    MapFragment.zzb.zza(zzaSc, paramActivity);
    paramAttributeSet = GoogleMapOptions.createFromAttributes(paramActivity, paramAttributeSet);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("MapOptions", paramAttributeSet);
    zzaSc.onInflate(paramActivity, localBundle, paramBundle);
  }
  
  public void onLowMemory()
  {
    zzaSc.onLowMemory();
    super.onLowMemory();
  }
  
  public void onPause()
  {
    zzaSc.onPause();
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    zzaSc.onResume();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.setClassLoader(MapFragment.class.getClassLoader());
    }
    super.onSaveInstanceState(paramBundle);
    zzaSc.onSaveInstanceState(paramBundle);
  }
  
  public void setArguments(Bundle paramBundle)
  {
    super.setArguments(paramBundle);
  }
  
  protected IMapFragmentDelegate zzzV()
  {
    zzaSc.zzzW();
    if (zzaSc.zztU() == null) {
      return null;
    }
    return ((MapFragment.zza)zzaSc.zztU()).zzzV();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.MapFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */