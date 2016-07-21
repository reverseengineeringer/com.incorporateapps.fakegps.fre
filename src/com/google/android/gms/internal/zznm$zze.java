package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.metadata.internal.zzj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class zznm$zze
  extends zzj
{
  public zznm$zze(int paramInt)
  {
    super("spaces", Arrays.asList(new String[] { "inDriveSpace", "isAppData", "inGooglePhotosSpace" }), Collections.emptySet(), paramInt);
  }
  
  protected Collection zzd(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramDataHolder.zze("inDriveSpace", paramInt1, paramInt2)) {
      localArrayList.add(DriveSpace.zzaoP);
    }
    if (paramDataHolder.zze("isAppData", paramInt1, paramInt2)) {
      localArrayList.add(DriveSpace.zzaoQ);
    }
    if (paramDataHolder.zze("inGooglePhotosSpace", paramInt1, paramInt2)) {
      localArrayList.add(DriveSpace.zzaoR);
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zznm.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */