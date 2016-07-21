package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;
import java.util.Collections;
import java.util.List;

public class SessionInsertRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzx();
  private final int mVersionCode;
  private final zzow zzaAD;
  private final List zzaBs;
  private final Session zzavX;
  private final List zzawg;
  
  SessionInsertRequest(int paramInt, Session paramSession, List paramList1, List paramList2, IBinder paramIBinder)
  {
    mVersionCode = paramInt;
    zzavX = paramSession;
    zzawg = Collections.unmodifiableList(paramList1);
    zzaBs = Collections.unmodifiableList(paramList2);
    zzaAD = zzow.zza.zzbR(paramIBinder);
  }
  
  public SessionInsertRequest(Session paramSession, List paramList1, List paramList2, zzow paramzzow)
  {
    mVersionCode = 3;
    zzavX = paramSession;
    zzawg = Collections.unmodifiableList(paramList1);
    zzaBs = Collections.unmodifiableList(paramList2);
    zzaAD = paramzzow;
  }
  
  private SessionInsertRequest(SessionInsertRequest.Builder paramBuilder)
  {
    this(SessionInsertRequest.Builder.zza(paramBuilder), SessionInsertRequest.Builder.zzb(paramBuilder), SessionInsertRequest.Builder.zzc(paramBuilder), null);
  }
  
  public SessionInsertRequest(SessionInsertRequest paramSessionInsertRequest, zzow paramzzow)
  {
    this(zzavX, zzawg, zzaBs, paramzzow);
  }
  
  private boolean zzb(SessionInsertRequest paramSessionInsertRequest)
  {
    return (zzw.equal(zzavX, zzavX)) && (zzw.equal(zzawg, zzawg)) && (zzw.equal(zzaBs, zzaBs));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return (paramObject == this) || (((paramObject instanceof SessionInsertRequest)) && (zzb((SessionInsertRequest)paramObject)));
  }
  
  public List getAggregateDataPoints()
  {
    return zzaBs;
  }
  
  public IBinder getCallbackBinder()
  {
    if (zzaAD == null) {
      return null;
    }
    return zzaAD.asBinder();
  }
  
  public List getDataSets()
  {
    return zzawg;
  }
  
  public Session getSession()
  {
    return zzavX;
  }
  
  int getVersionCode()
  {
    return mVersionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzavX, zzawg, zzaBs });
  }
  
  public String toString()
  {
    return zzw.zzy(this).zzg("session", zzavX).zzg("dataSets", zzawg).zzg("aggregateDataPoints", zzaBs).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzx.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fitness.request.SessionInsertRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */