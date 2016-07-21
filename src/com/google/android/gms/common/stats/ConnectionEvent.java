package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ConnectionEvent
  extends zzf
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  final int mVersionCode;
  private final long zzane;
  private int zzanf;
  private final String zzang;
  private final String zzanh;
  private final String zzani;
  private final String zzanj;
  private final String zzank;
  private final String zzanl;
  private final long zzanm;
  private final long zzann;
  private long zzano;
  
  ConnectionEvent(int paramInt1, long paramLong1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3)
  {
    mVersionCode = paramInt1;
    zzane = paramLong1;
    zzanf = paramInt2;
    zzang = paramString1;
    zzanh = paramString2;
    zzani = paramString3;
    zzanj = paramString4;
    zzano = -1L;
    zzank = paramString5;
    zzanl = paramString6;
    zzanm = paramLong2;
    zzann = paramLong3;
  }
  
  public ConnectionEvent(long paramLong1, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, long paramLong2, long paramLong3)
  {
    this(1, paramLong1, paramInt, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramLong2, paramLong3);
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
    zza.zza(this, paramParcel, paramInt);
  }
  
  public final String zzrF()
  {
    return zzang;
  }
  
  public final String zzrG()
  {
    return zzanh;
  }
  
  public final String zzrH()
  {
    return zzani;
  }
  
  public final String zzrI()
  {
    return zzanj;
  }
  
  public final String zzrJ()
  {
    return zzank;
  }
  
  public final String zzrK()
  {
    return zzanl;
  }
  
  public final long zzrL()
  {
    return zzano;
  }
  
  public final long zzrM()
  {
    return zzann;
  }
  
  public final long zzrN()
  {
    return zzanm;
  }
  
  public final String zzrO()
  {
    StringBuilder localStringBuilder = new StringBuilder("\t").append(zzrF()).append("/").append(zzrG()).append("\t").append(zzrH()).append("/").append(zzrI()).append("\t");
    if (zzank == null) {}
    for (String str = "";; str = zzank) {
      return str + "\t" + zzrM();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.stats.ConnectionEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */