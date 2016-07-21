package com.google.android.gms.location.places.ui;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.internal.PlaceImpl;

abstract class zza
{
  public static final int RESULT_ERROR = 2;
  
  public static Place getPlace(Context paramContext, Intent paramIntent)
  {
    zzx.zzb(paramIntent, "intent must not be null");
    zzx.zzb(paramContext, "context must not be null");
    return (Place)zzc.zza(paramIntent, "selected_place", PlaceImpl.CREATOR);
  }
  
  public static Status getStatus(Context paramContext, Intent paramIntent)
  {
    zzx.zzb(paramIntent, "intent must not be null");
    zzx.zzb(paramContext, "context must not be null");
    return (Status)zzc.zza(paramIntent, "status", Status.CREATOR);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.places.ui.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */