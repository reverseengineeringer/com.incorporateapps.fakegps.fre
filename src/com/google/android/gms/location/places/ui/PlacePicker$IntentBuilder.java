package com.google.android.gms.location.places.ui;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.model.LatLngBounds;

public class PlacePicker$IntentBuilder
  extends zza.zza
{
  public PlacePicker$IntentBuilder()
  {
    super("com.google.android.gms.location.places.ui.PICK_PLACE");
    mIntent.putExtra("gmscore_client_jar_version", GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE);
  }
  
  public Intent build(Activity paramActivity)
  {
    return super.build(paramActivity);
  }
  
  public IntentBuilder setLatLngBounds(LatLngBounds paramLatLngBounds)
  {
    zzx.zzz(paramLatLngBounds);
    zzc.zza(paramLatLngBounds, mIntent, "latlng_bounds");
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.ui.PlacePicker.IntentBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */