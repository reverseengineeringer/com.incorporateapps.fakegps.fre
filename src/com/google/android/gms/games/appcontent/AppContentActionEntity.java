package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.ArrayList;
import java.util.List;

public final class AppContentActionEntity
  implements SafeParcelable, AppContentAction
{
  public static final AppContentActionEntityCreator CREATOR = new AppContentActionEntityCreator();
  private final Bundle mExtras;
  private final int mVersionCode;
  private final String zzJN;
  private final ArrayList zzaDv;
  private final String zzaDw;
  private final AppContentAnnotationEntity zzaDx;
  private final String zzaDy;
  private final String zzyv;
  
  AppContentActionEntity(int paramInt, ArrayList paramArrayList, String paramString1, Bundle paramBundle, String paramString2, String paramString3, AppContentAnnotationEntity paramAppContentAnnotationEntity, String paramString4)
  {
    mVersionCode = paramInt;
    zzaDx = paramAppContentAnnotationEntity;
    zzaDv = paramArrayList;
    zzaDw = paramString1;
    mExtras = paramBundle;
    zzyv = paramString3;
    zzaDy = paramString4;
    zzJN = paramString2;
  }
  
  public AppContentActionEntity(AppContentAction paramAppContentAction)
  {
    mVersionCode = 5;
    zzaDx = ((AppContentAnnotationEntity)paramAppContentAction.zzvO().freeze());
    zzaDw = paramAppContentAction.zzvQ();
    mExtras = paramAppContentAction.getExtras();
    zzyv = paramAppContentAction.getId();
    zzaDy = paramAppContentAction.zzvR();
    zzJN = paramAppContentAction.getType();
    paramAppContentAction = paramAppContentAction.zzvP();
    int j = paramAppContentAction.size();
    zzaDv = new ArrayList(j);
    int i = 0;
    while (i < j)
    {
      zzaDv.add((AppContentConditionEntity)((AppContentCondition)paramAppContentAction.get(i)).freeze());
      i += 1;
    }
  }
  
  static int zza(AppContentAction paramAppContentAction)
  {
    return zzw.hashCode(new Object[] { paramAppContentAction.zzvO(), paramAppContentAction.zzvP(), paramAppContentAction.zzvQ(), paramAppContentAction.getExtras(), paramAppContentAction.getId(), paramAppContentAction.zzvR(), paramAppContentAction.getType() });
  }
  
  static boolean zza(AppContentAction paramAppContentAction, Object paramObject)
  {
    if (!(paramObject instanceof AppContentAction)) {}
    do
    {
      return false;
      if (paramAppContentAction == paramObject) {
        return true;
      }
      paramObject = (AppContentAction)paramObject;
    } while ((!zzw.equal(((AppContentAction)paramObject).zzvO(), paramAppContentAction.zzvO())) || (!zzw.equal(((AppContentAction)paramObject).zzvP(), paramAppContentAction.zzvP())) || (!zzw.equal(((AppContentAction)paramObject).zzvQ(), paramAppContentAction.zzvQ())) || (!zzw.equal(((AppContentAction)paramObject).getExtras(), paramAppContentAction.getExtras())) || (!zzw.equal(((AppContentAction)paramObject).getId(), paramAppContentAction.getId())) || (!zzw.equal(((AppContentAction)paramObject).zzvR(), paramAppContentAction.zzvR())) || (!zzw.equal(((AppContentAction)paramObject).getType(), paramAppContentAction.getType())));
    return true;
  }
  
  static String zzb(AppContentAction paramAppContentAction)
  {
    return zzw.zzy(paramAppContentAction).zzg("Annotation", paramAppContentAction.zzvO()).zzg("Conditions", paramAppContentAction.zzvP()).zzg("ContentDescription", paramAppContentAction.zzvQ()).zzg("Extras", paramAppContentAction.getExtras()).zzg("Id", paramAppContentAction.getId()).zzg("OverflowText", paramAppContentAction.zzvR()).zzg("Type", paramAppContentAction.getType()).toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final Bundle getExtras()
  {
    return mExtras;
  }
  
  public final String getId()
  {
    return zzyv;
  }
  
  public final String getType()
  {
    return zzJN;
  }
  
  public final int getVersionCode()
  {
    return mVersionCode;
  }
  
  public final int hashCode()
  {
    return zza(this);
  }
  
  public final boolean isDataValid()
  {
    return true;
  }
  
  public final String toString()
  {
    return zzb(this);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppContentActionEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public final AppContentAnnotation zzvO()
  {
    return zzaDx;
  }
  
  public final List zzvP()
  {
    return new ArrayList(zzaDv);
  }
  
  public final String zzvQ()
  {
    return zzaDw;
  }
  
  public final String zzvR()
  {
    return zzaDy;
  }
  
  public final AppContentAction zzvS()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentActionEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */