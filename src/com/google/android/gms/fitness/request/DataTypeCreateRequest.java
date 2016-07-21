package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zzoj;
import com.google.android.gms.internal.zzoj.zza;
import java.util.Collections;
import java.util.List;

public class DataTypeCreateRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzi();
  private final String mName;
  private final int mVersionCode;
  private final zzoj zzaBa;
  private final List zzawE;
  
  DataTypeCreateRequest(int paramInt, String paramString, List paramList, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    mName = paramString;
    zzawE = Collections.unmodifiableList(paramList);
    zzaBa = zzoj.zza.zzbE(paramIBinder);
  }
  
  private DataTypeCreateRequest(DataTypeCreateRequest.Builder paramBuilder)
  {
    this(DataTypeCreateRequest.Builder.zza(paramBuilder), DataTypeCreateRequest.Builder.zzb(paramBuilder), null);
  }
  
  public DataTypeCreateRequest(DataTypeCreateRequest paramDataTypeCreateRequest, zzoj paramzzoj)
  {
    this(mName, zzawE, paramzzoj);
  }
  
  public DataTypeCreateRequest(String paramString, List paramList, zzoj paramzzoj)
  {
    mVersionCode = 3;
    mName = paramString;
    zzawE = Collections.unmodifiableList(paramList);
    zzaBa = paramzzoj;
  }
  
  private boolean zzb(DataTypeCreateRequest paramDataTypeCreateRequest)
  {
    return (zzw.equal(mName, mName)) && (zzw.equal(zzawE, zzawE));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof DataTypeCreateRequest)) && (zzb((DataTypeCreateRequest)paramObject)));
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzaBa == null) {
      return null;
    }
    return zzaBa.asBinder();
  }
  
  public List getFields()
  {
    return zzawE;
  }
  
  public String getName()
  {
    return mName;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { mName, zzawE });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("name", mName).zzg("fields", zzawE).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.DataTypeCreateRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */