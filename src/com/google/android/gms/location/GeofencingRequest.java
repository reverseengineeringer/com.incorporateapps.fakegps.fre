package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

public class GeofencingRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  public static final int INITIAL_TRIGGER_DWELL = 4;
  public static final int INITIAL_TRIGGER_ENTER = 1;
  public static final int INITIAL_TRIGGER_EXIT = 2;
  private final int mVersionCode;
  private final List zzaNN;
  private final int zzaNO;
  
  GeofencingRequest(int paramInt1, List paramList, int paramInt2)
  {
    mVersionCode = paramInt1;
    zzaNN = paramList;
    zzaNO = paramInt2;
  }
  
  private GeofencingRequest(List paramList, int paramInt)
  {
    this(1, paramList, paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public List getGeofences()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(zzaNN);
    return localArrayList;
  }
  
  public int getInitialTrigger()
  {
    return zzaNO;
  }
  
  public int getVersionCode()
  {
    return mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public List zzyI()
  {
    return zzaNN;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.GeofencingRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */