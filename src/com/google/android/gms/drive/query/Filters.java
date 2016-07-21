package com.google.android.gms.drive.query;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza;
import com.google.android.gms.drive.query.internal.ComparisonFilter;
import com.google.android.gms.drive.query.internal.FieldOnlyFilter;
import com.google.android.gms.drive.query.internal.HasFilter;
import com.google.android.gms.drive.query.internal.InFilter;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.NotFilter;
import com.google.android.gms.drive.query.internal.Operator;
import com.google.android.gms.drive.query.internal.OwnedByMeFilter;

public class Filters
{
  public static Filter and(Filter paramFilter, Filter... paramVarArgs)
  {
    return new LogicalFilter(Operator.zzauC, paramFilter, paramVarArgs);
  }
  
  public static Filter and(Iterable paramIterable)
  {
    return new LogicalFilter(Operator.zzauC, paramIterable);
  }
  
  public static Filter contains(SearchableMetadataField paramSearchableMetadataField, String paramString)
  {
    return new ComparisonFilter(Operator.zzauF, paramSearchableMetadataField, paramString);
  }
  
  public static Filter eq(CustomPropertyKey paramCustomPropertyKey, String paramString)
  {
    if (paramString != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "Custom property value may not be null.");
      return new HasFilter(SearchableField.zzauc, new AppVisibleCustomProperties.zza().zza(paramCustomPropertyKey, paramString).zztA());
    }
  }
  
  public static Filter eq(SearchableMetadataField paramSearchableMetadataField, Object paramObject)
  {
    return new ComparisonFilter(Operator.zzaux, paramSearchableMetadataField, paramObject);
  }
  
  public static Filter greaterThan(SearchableOrderedMetadataField paramSearchableOrderedMetadataField, Comparable paramComparable)
  {
    return new ComparisonFilter(Operator.zzauA, paramSearchableOrderedMetadataField, paramComparable);
  }
  
  public static Filter greaterThanEquals(SearchableOrderedMetadataField paramSearchableOrderedMetadataField, Comparable paramComparable)
  {
    return new ComparisonFilter(Operator.zzauB, paramSearchableOrderedMetadataField, paramComparable);
  }
  
  public static Filter in(SearchableCollectionMetadataField paramSearchableCollectionMetadataField, Object paramObject)
  {
    return new InFilter(paramSearchableCollectionMetadataField, paramObject);
  }
  
  public static Filter lessThan(SearchableOrderedMetadataField paramSearchableOrderedMetadataField, Comparable paramComparable)
  {
    return new ComparisonFilter(Operator.zzauy, paramSearchableOrderedMetadataField, paramComparable);
  }
  
  public static Filter lessThanEquals(SearchableOrderedMetadataField paramSearchableOrderedMetadataField, Comparable paramComparable)
  {
    return new ComparisonFilter(Operator.zzauz, paramSearchableOrderedMetadataField, paramComparable);
  }
  
  public static Filter not(Filter paramFilter)
  {
    return new NotFilter(paramFilter);
  }
  
  public static Filter openedByMe()
  {
    return new FieldOnlyFilter(SearchableField.LAST_VIEWED_BY_ME);
  }
  
  public static Filter or(Filter paramFilter, Filter... paramVarArgs)
  {
    return new LogicalFilter(Operator.zzauD, paramFilter, paramVarArgs);
  }
  
  public static Filter or(Iterable paramIterable)
  {
    return new LogicalFilter(Operator.zzauD, paramIterable);
  }
  
  public static Filter ownedByMe()
  {
    return new OwnedByMeFilter();
  }
  
  public static Filter sharedWithMe()
  {
    return new FieldOnlyFilter(SearchableField.zzaub);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.query.Filters
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */