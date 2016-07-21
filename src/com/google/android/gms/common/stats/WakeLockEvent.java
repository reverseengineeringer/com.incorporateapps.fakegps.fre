package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public final class WakeLockEvent
  extends zzf
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzh();
  private final long mTimeout;
  final int mVersionCode;
  private final String zzanQ;
  private final int zzanR;
  private final List zzanS;
  private final String zzanT;
  private int zzanU;
  private final String zzanV;
  private final String zzanW;
  private final float zzanX;
  private final long zzane;
  private int zzanf;
  private final long zzanm;
  private long zzano;
  
  WakeLockEvent(int paramInt1, long paramLong1, int paramInt2, String paramString1, int paramInt3, List paramList, String paramString2, long paramLong2, int paramInt4, String paramString3, String paramString4, float paramFloat, long paramLong3)
  {
    mVersionCode = paramInt1;
    zzane = paramLong1;
    zzanf = paramInt2;
    zzanQ = paramString1;
    zzanV = paramString3;
    zzanR = paramInt3;
    zzano = -1L;
    zzanS = paramList;
    zzanT = paramString2;
    zzanm = paramLong2;
    zzanU = paramInt4;
    zzanW = paramString4;
    zzanX = paramFloat;
    mTimeout = paramLong3;
  }
  
  public WakeLockEvent(long paramLong1, int paramInt1, String paramString1, int paramInt2, List paramList, String paramString2, long paramLong2, int paramInt3, String paramString3, String paramString4, float paramFloat, long paramLong3)
  {
    this(1, paramLong1, paramInt1, paramString1, paramInt2, paramList, paramString2, paramLong2, paramInt3, paramString3, paramString4, paramFloat, paramLong3);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final int getEventType()
  {
    return zzanf;
  }
  
  public final long getTimeMillis()
  {
    return zzane;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public final String zzrK()
  {
    return zzanT;
  }
  
  public final long zzrL()
  {
    return zzano;
  }
  
  public final long zzrN()
  {
    return zzanm;
  }
  
  public final String zzrO()
  {
    StringBuilder localStringBuilder = new StringBuilder("\t").append(zzrR()).append("\t").append(zzrT()).append("\t");
    if (zzrU() == null)
    {
      str = "";
      localStringBuilder = localStringBuilder.append(str).append("\t").append(zzrV()).append("\t");
      if (zzrS() != null) {
        break label132;
      }
      str = "";
      label77:
      localStringBuilder = localStringBuilder.append(str).append("\t");
      if (zzrW() != null) {
        break label140;
      }
    }
    label132:
    label140:
    for (String str = "";; str = zzrW())
    {
      return str + "\t" + zzrX();
      str = TextUtils.join(",", zzrU());
      break;
      str = zzrS();
      break label77;
    }
  }
  
  public final String zzrR()
  {
    return zzanQ;
  }
  
  public final String zzrS()
  {
    return zzanV;
  }
  
  public final int zzrT()
  {
    return zzanR;
  }
  
  public final List zzrU()
  {
    return zzanS;
  }
  
  public final int zzrV()
  {
    return zzanU;
  }
  
  public final String zzrW()
  {
    return zzanW;
  }
  
  public final float zzrX()
  {
    return zzanX;
  }
  
  public final long zzrY()
  {
    return mTimeout;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.stats.WakeLockEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */