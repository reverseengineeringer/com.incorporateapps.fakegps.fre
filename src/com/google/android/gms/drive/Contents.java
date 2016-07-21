package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Contents
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  final int mVersionCode;
  final ParcelFileDescriptor zzajL;
  final boolean zzaoA;
  final int zzaox;
  final int zzaoy;
  final DriveId zzaoz;
  final String zzsU;
  
  Contents(int paramInt1, ParcelFileDescriptor paramParcelFileDescriptor, int paramInt2, int paramInt3, DriveId paramDriveId, boolean paramBoolean, String paramString)
  {
    mVersionCode = paramInt1;
    zzajL = paramParcelFileDescriptor;
    zzaox = paramInt2;
    zzaoy = paramInt3;
    zzaoz = paramDriveId;
    zzaoA = paramBoolean;
    zzsU = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public DriveId getDriveId()
  {
    return zzaoz;
  }
  
  public InputStream getInputStream()
  {
    return new FileInputStream(zzajL.getFileDescriptor());
  }
  
  public int getMode()
  {
    return zzaoy;
  }
  
  public OutputStream getOutputStream()
  {
    return new FileOutputStream(zzajL.getFileDescriptor());
  }
  
  public ParcelFileDescriptor getParcelFileDescriptor()
  {
    return zzajL;
  }
  
  public int getRequestId()
  {
    return zzaox;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public boolean zzsv()
  {
    return zzaoA;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.Contents
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */