package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.internal.zzap;
import com.google.android.gms.drive.internal.zzap.zza;
import com.google.android.gms.drive.internal.zzz;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.zzna;
import com.google.android.gms.internal.zznm;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class CompletionEvent
  implements SafeParcelable, ResourceEvent
{
  public static final Parcelable.Creator CREATOR = new zze();
  public static final int STATUS_CANCELED = 3;
  public static final int STATUS_CONFLICT = 2;
  public static final int STATUS_FAILURE = 1;
  public static final int STATUS_SUCCESS = 0;
  final int mVersionCode;
  final int zzBc;
  final String zzVa;
  final DriveId zzaoz;
  final ParcelFileDescriptor zzapD;
  final ParcelFileDescriptor zzapE;
  final MetadataBundle zzapF;
  final List zzapG;
  final IBinder zzapH;
  private boolean zzapI = false;
  private boolean zzapJ = false;
  private boolean zzapK = false;
  
  CompletionEvent(int paramInt1, DriveId paramDriveId, String paramString, ParcelFileDescriptor paramParcelFileDescriptor1, ParcelFileDescriptor paramParcelFileDescriptor2, MetadataBundle paramMetadataBundle, List paramList, int paramInt2, IBinder paramIBinder)
  {
    mVersionCode = paramInt1;
    zzaoz = paramDriveId;
    zzVa = paramString;
    zzapD = paramParcelFileDescriptor1;
    zzapE = paramParcelFileDescriptor2;
    zzapF = paramMetadataBundle;
    zzapG = paramList;
    zzBc = paramInt2;
    zzapH = paramIBinder;
  }
  
  private void zzsU()
  {
    if (zzapK) {
      throw new IllegalStateException("Event has already been dismissed or snoozed.");
    }
  }
  
  private void zzv(boolean paramBoolean)
  {
    zzsU();
    zzapK = true;
    zzna.zza(zzapD);
    zzna.zza(zzapE);
    if ((zzapF != null) && (zzapF.zzc(zznm.zzatz))) {
      ((BitmapTeleporter)zzapF.zza(zznm.zzatz)).release();
    }
    if (zzapH == null)
    {
      StringBuilder localStringBuilder1 = new StringBuilder("No callback on ");
      if (paramBoolean) {}
      for (str = "snooze";; str = "dismiss")
      {
        zzz.zzA("CompletionEvent", str);
        return;
      }
    }
    StringBuilder localStringBuilder2;
    try
    {
      zzap.zza.zzbd(zzapH).zzv(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      localStringBuilder2 = new StringBuilder("RemoteException on ");
      if (!paramBoolean) {}
    }
    for (String str = "snooze";; str = "dismiss")
    {
      zzz.zzA("CompletionEvent", str + ": " + localRemoteException);
      return;
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void dismiss()
  {
    zzv(false);
  }
  
  public final String getAccountName()
  {
    zzsU();
    return zzVa;
  }
  
  public final InputStream getBaseContentsInputStream()
  {
    zzsU();
    if (zzapD == null) {
      return null;
    }
    if (zzapI) {
      throw new IllegalStateException("getBaseInputStream() can only be called once per CompletionEvent instance.");
    }
    zzapI = true;
    return new FileInputStream(zzapD.getFileDescriptor());
  }
  
  public final DriveId getDriveId()
  {
    zzsU();
    return zzaoz;
  }
  
  public final InputStream getModifiedContentsInputStream()
  {
    zzsU();
    if (zzapE == null) {
      return null;
    }
    if (zzapJ) {
      throw new IllegalStateException("getModifiedInputStream() can only be called once per CompletionEvent instance.");
    }
    zzapJ = true;
    return new FileInputStream(zzapE.getFileDescriptor());
  }
  
  public final MetadataChangeSet getModifiedMetadataChangeSet()
  {
    zzsU();
    if (zzapF != null) {
      return new MetadataChangeSet(zzapF);
    }
    return null;
  }
  
  public final int getStatus()
  {
    zzsU();
    return zzBc;
  }
  
  public final List getTrackingTags()
  {
    zzsU();
    return new ArrayList(zzapG);
  }
  
  public final int getType()
  {
    return 2;
  }
  
  public final void snooze()
  {
    zzv(true);
  }
  
  public final String toString()
  {
    if (zzapG == null) {}
    for (String str = "<null>";; str = "'" + TextUtils.join("','", zzapG) + "'") {
      return String.format(Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", new Object[] { zzaoz, Integer.valueOf(zzBc), str });
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt | 0x1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.events.CompletionEvent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */