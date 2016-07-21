package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.ArrayList;
import java.util.List;

public final class AppContentCardEntity
  implements SafeParcelable, AppContentCard
{
  public static final AppContentCardEntityCreator CREATOR = new AppContentCardEntityCreator();
  private final ArrayList mActions;
  private final Bundle mExtras;
  private final int mVersionCode;
  private final String zzJN;
  private final ArrayList zzaDF;
  private final int zzaDG;
  private final String zzaDH;
  private final int zzaDI;
  private final ArrayList zzaDv;
  private final String zzaDw;
  private final String zzapg;
  private final String zzaxl;
  private final String zzyv;
  
  AppContentCardEntity(int paramInt1, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, String paramString1, int paramInt2, String paramString2, Bundle paramBundle, String paramString3, String paramString4, int paramInt3, String paramString5, String paramString6)
  {
    mVersionCode = paramInt1;
    mActions = paramArrayList1;
    zzaDF = paramArrayList2;
    zzaDv = paramArrayList3;
    zzaDw = paramString1;
    zzaDG = paramInt2;
    zzaxl = paramString2;
    mExtras = paramBundle;
    zzyv = paramString6;
    zzaDH = paramString3;
    zzapg = paramString4;
    zzaDI = paramInt3;
    zzJN = paramString5;
  }
  
  public AppContentCardEntity(AppContentCard paramAppContentCard)
  {
    mVersionCode = 4;
    zzaDw = paramAppContentCard.zzvQ();
    zzaDG = paramAppContentCard.zzwb();
    zzaxl = paramAppContentCard.getDescription();
    mExtras = paramAppContentCard.getExtras();
    zzyv = paramAppContentCard.getId();
    zzapg = paramAppContentCard.getTitle();
    zzaDH = paramAppContentCard.zzwc();
    zzaDI = paramAppContentCard.zzwd();
    zzJN = paramAppContentCard.getType();
    List localList = paramAppContentCard.getActions();
    int k = localList.size();
    mActions = new ArrayList(k);
    int i = 0;
    while (i < k)
    {
      mActions.add((AppContentActionEntity)((AppContentAction)localList.get(i)).freeze());
      i += 1;
    }
    localList = paramAppContentCard.zzwa();
    k = localList.size();
    zzaDF = new ArrayList(k);
    i = 0;
    while (i < k)
    {
      zzaDF.add((AppContentAnnotationEntity)((AppContentAnnotation)localList.get(i)).freeze());
      i += 1;
    }
    paramAppContentCard = paramAppContentCard.zzvP();
    k = paramAppContentCard.size();
    zzaDv = new ArrayList(k);
    i = j;
    while (i < k)
    {
      zzaDv.add((AppContentConditionEntity)((AppContentCondition)paramAppContentCard.get(i)).freeze());
      i += 1;
    }
  }
  
  static int zza(AppContentCard paramAppContentCard)
  {
    return zzw.hashCode(new Object[] { paramAppContentCard.getActions(), paramAppContentCard.zzwa(), paramAppContentCard.zzvP(), paramAppContentCard.zzvQ(), Integer.valueOf(paramAppContentCard.zzwb()), paramAppContentCard.getDescription(), paramAppContentCard.getExtras(), paramAppContentCard.getId(), paramAppContentCard.zzwc(), paramAppContentCard.getTitle(), Integer.valueOf(paramAppContentCard.zzwd()), paramAppContentCard.getType() });
  }
  
  static boolean zza(AppContentCard paramAppContentCard, Object paramObject)
  {
    if (!(paramObject instanceof AppContentCard)) {}
    do
    {
      return false;
      if (paramAppContentCard == paramObject) {
        return true;
      }
      paramObject = (AppContentCard)paramObject;
    } while ((!zzw.equal(((AppContentCard)paramObject).getActions(), paramAppContentCard.getActions())) || (!zzw.equal(((AppContentCard)paramObject).zzwa(), paramAppContentCard.zzwa())) || (!zzw.equal(((AppContentCard)paramObject).zzvP(), paramAppContentCard.zzvP())) || (!zzw.equal(((AppContentCard)paramObject).zzvQ(), paramAppContentCard.zzvQ())) || (!zzw.equal(Integer.valueOf(((AppContentCard)paramObject).zzwb()), Integer.valueOf(paramAppContentCard.zzwb()))) || (!zzw.equal(((AppContentCard)paramObject).getDescription(), paramAppContentCard.getDescription())) || (!zzw.equal(((AppContentCard)paramObject).getExtras(), paramAppContentCard.getExtras())) || (!zzw.equal(((AppContentCard)paramObject).getId(), paramAppContentCard.getId())) || (!zzw.equal(((AppContentCard)paramObject).zzwc(), paramAppContentCard.zzwc())) || (!zzw.equal(((AppContentCard)paramObject).getTitle(), paramAppContentCard.getTitle())) || (!zzw.equal(Integer.valueOf(((AppContentCard)paramObject).zzwd()), Integer.valueOf(paramAppContentCard.zzwd()))) || (!zzw.equal(((AppContentCard)paramObject).getType(), paramAppContentCard.getType())));
    return true;
  }
  
  static String zzb(AppContentCard paramAppContentCard)
  {
    return zzw.zzy(paramAppContentCard).zzg("Actions", paramAppContentCard.getActions()).zzg("Annotations", paramAppContentCard.zzwa()).zzg("Conditions", paramAppContentCard.zzvP()).zzg("ContentDescription", paramAppContentCard.zzvQ()).zzg("CurrentSteps", Integer.valueOf(paramAppContentCard.zzwb())).zzg("Description", paramAppContentCard.getDescription()).zzg("Extras", paramAppContentCard.getExtras()).zzg("Id", paramAppContentCard.getId()).zzg("Subtitle", paramAppContentCard.zzwc()).zzg("Title", paramAppContentCard.getTitle()).zzg("TotalSteps", Integer.valueOf(paramAppContentCard.zzwd())).zzg("Type", paramAppContentCard.getType()).toString();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    return zza(this, paramObject);
  }
  
  public final List getActions()
  {
    return new ArrayList(mActions);
  }
  
  public final String getDescription()
  {
    return zzaxl;
  }
  
  public final Bundle getExtras()
  {
    return mExtras;
  }
  
  public final String getId()
  {
    return zzyv;
  }
  
  public final String getTitle()
  {
    return zzapg;
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
    AppContentCardEntityCreator.zza(this, paramParcel, paramInt);
  }
  
  public final List zzvP()
  {
    return new ArrayList(zzaDv);
  }
  
  public final String zzvQ()
  {
    return zzaDw;
  }
  
  public final List zzwa()
  {
    return new ArrayList(zzaDF);
  }
  
  public final int zzwb()
  {
    return zzaDG;
  }
  
  public final String zzwc()
  {
    return zzaDH;
  }
  
  public final int zzwd()
  {
    return zzaDI;
  }
  
  public final AppContentCard zzwe()
  {
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentCardEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */