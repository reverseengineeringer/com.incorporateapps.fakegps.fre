package com.google.android.gms.location.places.ui;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;

public class PlaceAutocomplete
  extends zza
{
  public static final int MODE_FULLSCREEN = 1;
  public static final int MODE_OVERLAY = 2;
  public static final int RESULT_ERROR = 2;
  
  public static Place getPlace(Context paramContext, Intent paramIntent)
  {
    return zza.getPlace(paramContext, paramIntent);
  }
  
  public static Status getStatus(Context paramContext, Intent paramIntent)
  {
    return zza.getStatus(paramContext, paramIntent);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.ui.PlaceAutocomplete
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */