package com.symmetry.Pokedex.utilities;

import com.symmetry.Pokedex.Entities.Pokemon;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class OffsetLimitPageable implements Pageable {
    private int offset;
    private int page;
    private int size;
    private Sort sort = Sort.by("id");

    protected OffsetLimitPageable(int offset, int page, int size) {
        if (offset < 0) {
            this.offset = 0;
        } else {
            this.offset = offset;
        }

        if (page < 0) {
            this.page = 0;
        } else {
            this.page = page;
        }

        if (size < 1) {
            this.size = 0;
        } else {
            this.size = size;
        }

    }

    public static OffsetLimitPageable func(int offset, int page, int size) {
        return new OffsetLimitPageable(offset, page, size);
    }


    @Override
    public int getPageNumber() {
        return this.page;
    }

    @Override
    public int getPageSize() {
        return this.size;
    }

    @Override
    public long getOffset() {
        return this.offset;
    }

    @Override
    public Sort getSort() {
        return sort;
    }

    @Override
    public Pageable next() {
        return func(offset, page + 1, size);
    }

    @Override
    public Pageable previousOrFirst() {
        return hasPrevious() ? func(offset, page - 1, size) : first();
    }

    @Override
    public Pageable first() {
        return func(offset, 0, size);
    }

    @Override
    public Pageable withPage(int i) {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return page > 0;
    }
}
