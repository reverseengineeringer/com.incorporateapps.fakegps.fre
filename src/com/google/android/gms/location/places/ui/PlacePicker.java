package com.google.android.gms.location.places.ui;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLngBounds;

public class PlacePicker
  extends zza
{
  public static final int RESULT_ERROR = 2;
  
  public static String getAttributions(Intent paramIntent)
  {
    return paramIntent.getStringExtra("third_party_attributions");
  }
  
  public static LatLngBounds getLatLngBounds(Intent paramIntent)
  {
    return (LatLngBounds)zzc.zza(paramIntent, "final_latlng_bounds", LatLngBounds.CREATOR);
  }
  
  public static Place getPlace(Context paramContext, Intent paramIntent)
  {
    return zza.getPlace(paramContext, paramIntent);
  }
  
  public static Place getPlace(Intent paramIntent, Context paramContext)
  {
    return zza.getPlace(paramContext, paramIntent);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.ui.PlacePicker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */