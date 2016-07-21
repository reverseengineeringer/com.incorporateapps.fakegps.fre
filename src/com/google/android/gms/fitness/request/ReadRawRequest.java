package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzos;
import com.google.android.gms.internal.zzos.zza;
import java.util.List;

public class ReadRawRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzt();
  private final int mVersionCode;
  private final boolean zzaAP;
  private final boolean zzaAQ;
  private final zzos zzaBe;
  private final List zzaBf;
  
  ReadRawRequest(int paramInt, IBinder paramIBinder, List paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    mVersionCode = paramInt;
    zzaBe = zzos.zza.zzbN(paramIBinder);
    zzaBf = paramList;
    zzaAP = paramBoolean1;
    zzaAQ = paramBoolean2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzaBe != null) {
      return zzaBe.asBinder();
    }
    return null;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzt.zza(this, paramParcel, paramInt);
  }
  
  public boolean zzuP()
  {
    return zzaAQ;
  }
  
  public boolean zzuQ()
  {
    return zzaAP;
  }
  
  public List zzuW()
  {
    return zzaBf;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.ReadRawRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */