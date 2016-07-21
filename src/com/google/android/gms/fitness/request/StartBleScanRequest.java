package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;
import java.util.Collections;
import java.util.List;

public class StartBleScanRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzad();
  private final int mVersionCode;
  private final zzow zzaAD;
  private final zzq zzaBA;
  private final int zzaBB;
  private final List zzawe;
  
  StartBleScanRequest(int paramInt1, List paramList, IBinder paramIBinder1, int paramInt2, IBinder paramIBinder2)
  {
    mVersionCode = paramInt1;
    zzawe = paramList;
    zzaBA = zzq.zza.zzbU(paramIBinder1);
    zzaBB = paramInt2;
    zzaAD = zzow.zza.zzbR(paramIBinder2);
  }
  
  private StartBleScanRequest(StartBleScanRequest.Builder paramBuilder)
  {
    this(zzmn.zzb(StartBleScanRequest.Builder.zza(paramBuilder)), StartBleScanRequest.Builder.zzb(paramBuilder), StartBleScanRequest.Builder.zzc(paramBuilder), null);
  }
  
  public StartBleScanRequest(StartBleScanRequest paramStartBleScanRequest, zzow paramzzow)
  {
    this(zzawe, zzaBA, zzaBB, paramzzow);
  }
  
  public StartBleScanRequest(List paramList, zzq paramzzq, int paramInt, zzow paramzzow)
  {
    mVersionCode = 4;
    zzawe = paramList;
    zzaBA = paramzzq;
    zzaBB = paramInt;
    zzaAD = paramzzow;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzaAD == null) {
      return null;
    }
    return zzaAD.asBinder();
  }
  
  public List getDataTypes()
  {
    return Collections.unmodifiableList(zzawe);
  }
  
  public int getTimeoutSecs()
  {
    return zzaBB;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("dataTypes", zzawe).zzg("timeoutSecs", Integer.valueOf(zzaBB)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzad.zza(this, paramParcel, paramInt);
  }
  
  public IBinder zzvg()
  {
    return zzaBA.asBinder();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.StartBleScanRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */